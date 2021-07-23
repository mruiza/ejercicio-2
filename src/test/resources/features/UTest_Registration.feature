# Autor: Carlos Armando Estrada Torres

@stories
Feature: uTest Page
  As a user, want to create new account at utest page with registration form

  @scenario1
  Scenario Outline: Registration form
    Given as Pedro want to create a new account at utest page
    When complete registration form
      | firstName      | lastName      | email      | monthBirth      | dayBirth      | yearBirth      | languageSpoken      | city      | postalCode      | country      | computerOs      | computerVersion      | computerLanguage      | mobileBrand      | mobileModel      | mobileOs      | password      |
      | <strfirstName> | <strlastName> | <stremail> | <strmonthBirth> | <strdayBirth> | <stryearBirth> | <strlanguageSpoken> | <strcity> | <strpostalCode> | <strcountry> | <strcomputerOs> | <strcomputerVersion> | <strcomputerLanguage> | <strmobileBrand> | <strmobileModel> | <strmobileOs> | <strpassword> |
    Then validate label on last step of form
      | lastStepLabel      |
      | <strlastStepLabel> |

    Examples:
      | strfirstName | strlastName | stremail                    | strmonthBirth | strdayBirth | stryearBirth | strlanguageSpoken | strcity  | strpostalCode | strcountry | strcomputerOs | strcomputerVersion | strcomputerLanguage | strmobileBrand | strmobileModel | strmobileOs | strpassword   | strlastStepLabel |
      | Pedro Pepito | Lopez       | ppepito.lopez1968@gmail.com | June          | 6           | 1968         | Spanish           | Medellín | 661001        | Argentina  | Linux         | Ubuntu             | English             | Xiaomi         | Mi A2          | 10          | T3sting2021*. | The last step    |