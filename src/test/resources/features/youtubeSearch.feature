Feature: Test de automatización usando el patrón screenplay.
  Yo como tester automatizador
  Necsito buscar la canción Locked out of heaven
  Para proceder a disfrutarla

 Scenario: Busqueda de la canción Locked out of heaven de Bruno Mars en youtube
   Given estando en la pagina principal de Youtube
   When se realiza la busqueda de la canción Locked out of heaven
   Then se reproduce la canción en Youtube