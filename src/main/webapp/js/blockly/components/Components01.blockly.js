window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.components = window.blockly.js.blockly.components || {};
window.blockly.js.blockly.components.Components01 = window.blockly.js.blockly.components.Components01 || {};

/**
 * @function webValidateBlock
 *
 *
 *
 *
 * @author Leandro Leonardo Assarice
 * @since 08/08/2023, 08:35:50
 *
 */
window.blockly.js.blockly.components.Components01.webValidateBlockArgs = [];
window.blockly.js.blockly.components.Components01.webValidateBlock = async function() {
 var users;
  //
  this.cronapi.screen.changeValueOfField("vars.result", 'Bloco web validado!');
}

/**
 * @function validateCheckBox
 *
 *
 *
 * @param option
 *
 * @author Leandro Leonardo Assarice
 * @since 08/08/2023, 08:35:50
 *
 */
window.blockly.js.blockly.components.Components01.validateCheckBoxArgs = [{ description: 'option', id: '9a9a3128' }];
window.blockly.js.blockly.components.Components01.validateCheckBox = async function(option) {

  //
  this.cronapi.screen.changeValueOfField("vars.result", option);
}

/**
 * @function validateText
 *
 *
 *
 * @param field
 *
 * @author Leandro Leonardo Assarice
 * @since 08/08/2023, 08:35:50
 *
 */
window.blockly.js.blockly.components.Components01.validateTextArgs = [{ description: 'field', id: '265144ec' }];
window.blockly.js.blockly.components.Components01.validateText = async function(field) {

  //
  this.cronapi.screen.changeValueOfField("vars.result", field);
}

/**
 * @function validateMultipleCombobox
 *
 *
 *
 *
 * @author Leandro Leonardo Assarice
 * @since 08/08/2023, 08:35:50
 *
 */
window.blockly.js.blockly.components.Components01.validateMultipleComboboxArgs = [];
window.blockly.js.blockly.components.Components01.validateMultipleCombobox = async function() {
 var users;
  //
  users = this.cronapi.map.getMapValueByPath(this.cronapi.screen.getValueOfField("vars.multipleComboboxValue"), 'nome');
  //
  this.cronapi.screen.changeValueOfField("vars.result", users);
  //
  console.log(this.cronapi.screen.getValueOfField("vars.multipleComboboxValue"));
}
