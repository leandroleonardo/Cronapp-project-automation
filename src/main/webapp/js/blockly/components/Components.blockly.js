window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.components = window.blockly.js.blockly.components || {};
window.blockly.js.blockly.components.Components = window.blockly.js.blockly.components.Components || {};

/**
 * @function validateCalendar
 *
 *
 *
 *
 * @author Leandro Leonardo Assarice
 * @since 01/08/2023, 14:06:21
 *
 */
window.blockly.js.blockly.components.Components.validateCalendarArgs = [];
window.blockly.js.blockly.components.Components.validateCalendar = async function() {
 var date;
  //
  this.cronapi.screen.changeValueOfField("vars.resultCalendar", (await this.cronapi.client('cronapi.calendar.getCalendarSelectDates').run("crn-cron-calendar-487765")));
}

/**
 * @function validateHour
 *
 *
 *
 * @param time
 *
 * @author Leandro Leonardo Assarice
 * @since 01/08/2023, 14:06:21
 *
 */
window.blockly.js.blockly.components.Components.validateHourArgs = [{ description: 'time', id: '06449423' }];
window.blockly.js.blockly.components.Components.validateHour = async function(time) {

  //
  this.cronapi.screen.changeValueOfField("vars.resultHourValue", time);
}

/**
 * @function validateDateTime
 *
 *
 *
 * @param DateTime
 *
 * @author Leandro Leonardo Assarice
 * @since 01/08/2023, 14:06:21
 *
 */
window.blockly.js.blockly.components.Components.validateDateTimeArgs = [{ description: 'DateTime', id: '06449423' }];
window.blockly.js.blockly.components.Components.validateDateTime = async function(DateTime) {

  //
  this.cronapi.screen.changeValueOfField("vars.resultValueDateHour", DateTime);
}

/**
 * @function validateDate
 *
 *
 *
 * @param date
 *
 * @author Leandro Leonardo Assarice
 * @since 01/08/2023, 14:06:21
 *
 */
window.blockly.js.blockly.components.Components.validateDateArgs = [{ description: 'date', id: 'a55c2dc4' }];
window.blockly.js.blockly.components.Components.validateDate = async function(date) {

  //
  this.cronapi.screen.changeValueOfField("vars.resultDateValue", date);
}
