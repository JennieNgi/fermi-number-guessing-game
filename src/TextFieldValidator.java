import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class TextFieldValidator {
	/** the regular expression of this Text Field Validator**/
	private String regExp;
	/** the error color of this Text Field Validator**/
	private Color errorColor;
	/** the target of this Text Field Validator**/
	private JTextField target;
	/** the error status of this Text Field Validator**/
	private boolean validateStatus;
	
	/** Creation of a Text Field Validator object
	 * @param The target textfield and the error color 
	 **/
	public TextFieldValidator(JTextField myTarget, Color myErrorColor) {
		target = myTarget;
		regExp = "//w";
		errorColor = myErrorColor;
		validateStatus = true;
    }
	
	/** Creation of a Text Field Validator object with a target
	 * @param The target textfield
	 **/
	public TextFieldValidator(JTextField myTarget) {
//		target = myTarget;
//		regExp = "//w";
//		errorColor = Color.RED;
//		validateStatus = true;
		this(myTarget, Color.RED);
    }
	
	/** Sets the regular expression
     * @param The regular expression
    */
	public void setRegExp(String myRegExp) {
        regExp = myRegExp;
    }
	
	/** Sets the error color
     * @param The error color
    */
	public void setErrorColor(Color myColor) {
		errorColor = myColor;
    }
	
	/** Gets the error status
	 * @return An boolean representing the error status
	 */
	public boolean getValidateStatus() {
		return validateStatus;
	}
	
	/** Check whether the target match the regular expression and change the error color of the border when the error status is false
	 * @return An boolean representing the error status 
	 */
	public boolean check() {
		if (target.getText().matches(regExp)) {
			validateStatus = true;
		}else {
			target.setBorder(new LineBorder(errorColor, 2));
			validateStatus = false;
		}
		return validateStatus;
	}
	
	/** Reset the input textfield border to default*/
	public void reset() {
		target.setBorder(new JTextField().getBorder());
	}
	
	
}
