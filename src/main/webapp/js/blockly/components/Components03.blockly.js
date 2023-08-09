window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.components = window.blockly.js.blockly.components || {};
window.blockly.js.blockly.components.Components03 = window.blockly.js.blockly.components.Components03 || {};

/**
 * @function validateCheckImg
 *
 *
 *
 * @param date
 *
 * @author Leandro Leonardo Assarice
 * @since 01/08/2023, 14:32:45
 *
 */
window.blockly.js.blockly.components.Components03.validateCheckImgArgs = [{ description: 'date', id: 'e112f887' }];
window.blockly.js.blockly.components.Components03.validateCheckImg = async function(date) {

  //
  this.cronapi.screen.changeValueOfField("vars.resultValue", this.cronapi.json.getProperty(this.cronapi.json.createObjectFromString(date), 'type'));
}

/**
 * @function validateCheckBox
 *
 *
 *
 * @param option
 *
 * @author Leandro Leonardo Assarice
 * @since 01/08/2023, 14:32:45
 *
 */
window.blockly.js.blockly.components.Components03.validateCheckBoxArgs = [{ description: 'option', id: '9a9a3128' }];
window.blockly.js.blockly.components.Components03.validateCheckBox = async function(option) {

  //
  this.cronapi.screen.changeValueOfField("vars.resultValue", option);
}

/**
 * @function validate
 *
 *
 *
 * @param date
 *
 * @author Leandro Leonardo Assarice
 * @since 01/08/2023, 14:32:45
 *
 */
window.blockly.js.blockly.components.Components03.validateArgs = [{ description: 'date', id: 'e112f887' }];
window.blockly.js.blockly.components.Components03.validate = async function(date) {

  //
  this.cronapi.screen.changeValueOfField("vars.resultValue", date);
}
