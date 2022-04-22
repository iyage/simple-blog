//show/hide collapse button
$("#show-general").click(() => {
  $("#hide-general").show();
  $("#general").fadeIn();
  $("#show-general").hide();
});
$("#hide-general").click(() => {
  $("#hide-general").hide();
  $("#general").hide();
  $("#show-general").show();
});

$("#show-entertainment").click(() => {
  $("#hide-entertainment").show();
  $("#entertainment").fadeIn();
  $("#show-entertainment").hide();
});
$("#hide-entertainment").click(() => {
  $("#hide-entertainment").hide();
  $("#entertainment").hide();
  $("#show-entertainment").show();
});

$("#show-science").click(() => {
  $("#hide-science").show();
  $("#science").fadeIn();
  $("#show-science").hide();
});
$("#hide-science").click(() => {
  $("#hide-science").hide();
  $("#science").hide();
  $("#show-science").show();
});
