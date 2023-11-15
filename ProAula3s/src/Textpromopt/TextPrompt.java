/*este coidgo fue sacado de un repositorio de GitHub que me fue de Gran ayuda
en mis inicio de sesion
consejosjava se llama el que proporciono este cod */
package Textpromopt;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import javax.swing.text.*;

/**
 *
 * La clase TextPrompt mostrará un mensaje sobre un componente de texto cuando
 * el Documento del campo de texto está vacío. La propiedad Mostrar se utiliza
 * para determinar la visibilidad del mensaje.
 *
 * La fuente y el color de primer plano del mensaje tendrán por defecto esas
 * propiedades del componente de texto principal. Eres libre de cambiar las
 * propiedades después construcción de clases.
 */
public class TextPrompt extends JLabel
        implements FocusListener, DocumentListener {

    public enum Show {
        ALWAYS,
        FOCUS_GAINED,
        FOCUS_LOST;
    }

    private JTextComponent component;
    private Document document;

    private Show show;
    private boolean showPromptOnce;
    private int focusLost;

    public TextPrompt(String text, JTextComponent component) {
        this(text, component, Show.ALWAYS);
    }

    public TextPrompt(String text, JTextComponent component, Show show) {
        this.component = component;
        setShow(show);
        document = component.getDocument();

        setText(text);
        setFont(component.getFont());
        setForeground(component.getForeground());
        setBorder(new EmptyBorder(component.getInsets()));
        setHorizontalAlignment(JLabel.LEADING);

        component.addFocusListener(this);
        document.addDocumentListener(this);

        component.setLayout(new BorderLayout());
        component.add(this);
        checkForPrompt();
    }

    /**
     * * Método conveniente para cambiar el valor alfa del primer plano actual *
     * Color al valor específico.
     *
     *
     * @param valor alfa en el rango de 0 - 1,0.
     */
    public void changeAlpha(float alpha) {
        changeAlpha((int) (alpha * 255));
    }

    /**
     * * Método conveniente para cambiar el valor alfa del primer plano actual
     * Color al valor específico.
     *
     *
     * @param valor alpha en el rango de 0 - 255.
     */
    public void changeAlpha(int alpha) {
        alpha = alpha > 255 ? 255 : alpha < 0 ? 0 : alpha;

        Color foreground = getForeground();
        int red = foreground.getRed();
        int green = foreground.getGreen();
        int blue = foreground.getBlue();

        Color withAlpha = new Color(red, green, blue, alpha);
        super.setForeground(withAlpha);
    }

    /**
     * Método conveniente para cambiar el estilo de la fuente actual. El estilo
     * los valores se encuentran en la clase Fuente. Los valores comunes podrían
     * ser: Fuente.BOLD, Fuente.ITALIC y Fuente.BOLD + Fuente.ITALIC.
     *
     * Valor de style @param que representa el nuevo estilo de la fuente.
     */
    public void changeStyle(int style) {
        setFont(getFont().deriveFont(style));
    }

    /**
     * Obtener la propiedad Mostrar
     *
     * @return la propiedad Mostrar.
     */
    public Show getShow() {
        return show;
    }

    /**
     * Establezca la propiedad Mostrar mensaje para controlar cuándo se muestra
     * el mensaje. Los valores válidos son:
     *
     * Show.AWLAYS (predeterminado): muestra siempre el mensaje
     * Show.Focus_GAINED: muestra el mensaje cuando el componente gana foco (y
     * ocultar el mensaje cuando se pierde el foco) Show.Focus_LOST: muestra el
     * mensaje cuando el componente pierde el foco (y ocultar el mensaje cuando
     * se obtiene el foco)
     *
     * @param show una enumeración Mostrar válida
     */
    public void setShow(Show show) {
        this.show = show;
    }

    /**
     * Obtener la propiedad showPromptOnce
     *
     * @return la propiedad showPromptOnce.
     */
    public boolean getShowPromptOnce() {
        return showPromptOnce;
    }

    /**
     * Muestra el mensaje una vez. Una vez que el componente ha ganado o perdido
     * foco una vez, el mensaje no se volverá a mostrar.
     *
     * @param showPromptOnce cuando sea verdadero, el mensaje solo se mostrará
     * una vez, en caso contrario se mostrará repetidamente.
     */
    public void setShowPromptOnce(boolean showPromptOnce) {
        this.showPromptOnce = showPromptOnce;
    }

    /**
     * Compruebe si el mensaje debe ser visible o no. la visibilidad cambiará
     * con las actualizaciones del Documento y con los cambios de enfoque.
     */
    private void checkForPrompt() {
        // Se ha ingresado texto, elimina el mensaje

        if (document.getLength() > 0) {
            setVisible(false);
            return;
        }

        // El mensaje ya se mostró una vez, elimínelo
        if (showPromptOnce && focusLost > 0) {
            setVisible(false);
            return;
        }

        // Verifique Mostrar propiedad y foco de componente para determinar si el
        // debe mostrarse el mensaje.
        if (component.hasFocus()) {
            if (show == Show.ALWAYS
                    || show == Show.FOCUS_GAINED) {
                setVisible(true);
            } else {
                setVisible(false);
            }
        } else {
            if (show == Show.ALWAYS
                    || show == Show.FOCUS_LOST) {
                setVisible(true);
            } else {
                setVisible(false);
            }
        }
    }

//  Implement FocusListener
    public void focusGained(FocusEvent e) {
        checkForPrompt();
    }

    public void focusLost(FocusEvent e) {
        focusLost++;
        checkForPrompt();
    }

//  Implement DocumentListener
    public void insertUpdate(DocumentEvent e) {
        checkForPrompt();
    }

    public void removeUpdate(DocumentEvent e) {
        checkForPrompt();
    }

    public void changedUpdate(DocumentEvent e) {
    }
}
