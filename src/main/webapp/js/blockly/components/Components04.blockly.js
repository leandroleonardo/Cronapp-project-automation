window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.components = window.blockly.js.blockly.components || {};
window.blockly.js.blockly.components.Components04 = window.blockly.js.blockly.components.Components04 || {};

/**
 * @function validateHeader
 *
 *
 *
 *
 * @author Leandro Leonardo Assarice
 * @since 02/08/2023, 11:13:19
 *
 */
window.blockly.js.blockly.components.Components04.validateHeaderArgs = [];
window.blockly.js.blockly.components.Components04.validateHeader = async function() {

  //
  this.cronapi.screen.changeValueOfField("vars.ResultCMP4Value", 'Botão de cabeçalho validado!');
}

/**
 * @function generateGraphics
 *
 *
 *
 *
 * @author Leandro Leonardo Assarice
 * @since 02/08/2023, 11:13:19
 *
 */
window.blockly.js.blockly.components.Components04.generateGraphicsArgs = [];
window.blockly.js.blockly.components.Components04.generateGraphics = async function() {

  //
  this.cronapi.chart.createChart("chartCanvas", 'bar', ['Janeiro', 'Fevereiro', 'Março'], null, [this.cronapi.chart.createDataset('Chocolate', ['210770', '19235', '21470'], null), this.cronapi.chart.createDataset('Jujuba', ['18050', '20136', '21536'], null)]);
}
