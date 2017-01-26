@login
Feature: login

  Scenario: I'm like user wont to login into boomerang website

    Given Opened login page
    When Set username like: kostyantins@ukr.net
    When Set password like: 123456
    When Do log in
    Then Check if user like: "kostyantins" authorized