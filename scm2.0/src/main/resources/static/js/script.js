let currentTheme = getThemeLocalSotrage();

function setThemetoLocalStorage(theme) {
  document.querySelector("html").classList.remove(getThemeLocalSotrage());
  document.querySelector("html").classList.add(theme);
  localStorage.setItem("theme", theme);
  document.querySelector("#theme_change_button").innerHTML =
    theme == "dark" ? "Light" : "Dark";
}

function getThemeLocalSotrage() {
  let theme = localStorage.getItem("theme");
  return theme != undefined ? theme : "light";
}

function toggleTheme() {
  currentTheme = getThemeLocalSotrage();
  currentTheme == "light"
    ? setThemetoLocalStorage("dark")
    : setThemetoLocalStorage("light");
}
toggleTheme();
