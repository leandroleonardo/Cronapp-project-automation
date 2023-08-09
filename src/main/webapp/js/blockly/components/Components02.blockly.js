window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.components = window.blockly.js.blockly.components || {};
window.blockly.js.blockly.components.Components02 = window.blockly.js.blockly.components.Components02 || {};

/**
 * @function disableDashboard
 *
 *
 *
 *
 * @author Leandro Leonardo Assarice
 * @since 31/07/2023, 15:57:38
 *
 */
window.blockly.js.blockly.components.Components02.disableDashboardArgs = [];
window.blockly.js.blockly.components.Components02.disableDashboard = async function() {

  //
  this.cronapi.screen.disableComponent("crn-cron-dashboard");
}

/**
 * @function qrCode
 *
 *
 *
 *
 * @author Leandro Leonardo Assarice
 * @since 31/07/2023, 15:57:38
 *
 */
window.blockly.js.blockly.components.Components02.qrCodeArgs = [];
window.blockly.js.blockly.components.Components02.qrCode = async function() {

  //
  this.cronapi.screen.changeValueOfField("vars.QRcodeValue", 'QRcode validado!');
}

/**
 * @function validateSignature
 *
 *
 *
 *
 * @author Leandro Leonardo Assarice
 * @since 31/07/2023, 15:57:38
 *
 */
window.blockly.js.blockly.components.Components02.validateSignatureArgs = [];
window.blockly.js.blockly.components.Components02.validateSignature = async function() {

  //
  this.cronapi.screen.changeAttrValue("crn-image-value", 'src', String('data:image/png;base64,') + String(this.cronapi.screen.getValueOfField("vars.inpuSignatureValue")));
}

/**
 * @function getDashboard
 *
 *
 *
 *
 * @author Leandro Leonardo Assarice
 * @since 31/07/2023, 15:57:38
 *
 */
window.blockly.js.blockly.components.Components02.getDashboardArgs = [];
window.blockly.js.blockly.components.Components02.getDashboard = async function() {

  //
  this.cronapi.screen.enableComponent("crn-cron-dashboard-viewer");
}
