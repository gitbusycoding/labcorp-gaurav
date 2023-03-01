Your application should create a list of 10 instances of each type of employee on startup.
Controllers for UI, with proper error handling.

/**
  Each employee has a floating-point property for number of vacation days accumulated for the work year (defined as 260 workdays)
  which cannot be a negative value and is not writable externally.
  Upon creation its value should be set to 0.
 */
Employee:
  -float numVacationDaysThisYear=0

  /**
    Logs num days worked and updates vacation days remaining.
    @param numDays between 0 and 260
   */
  work(int numDays)

  /**
    Logs num days of vacation taken.
    @param numDays must not exceed allocated vacation
   */
  takeVacation(float numDays)

/**
  Hourly employees accumulate 10 vacation days during the work year.
 */
↑ hourly

/**
  Salaried employees accumulate 15 vacation days during the work year.
 */
↑ salaried

  /**
  Managers accumulate 30 vacation days during the work year.
  */
  ↑ managers (also considered salaried employees)
