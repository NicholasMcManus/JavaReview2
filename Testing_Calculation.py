import math

monthOfYear = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

ms = 561555550000
#Determine Years
seconds = ms / 1000
minutes = seconds / 60
hours = minutes /60
days = hours/24
months = days/30
years = days /365

print('{} true days'.format(days))
print('Days from months: {}'.format((months-math.floor(months))*30))
print('{} true months'.format(months))
print('Months from years: {}'.format((years-math.floor(years))*12))
print('{} years'.format(years))



days = math.floor(hours/24)
#month = 0
#years = days / 365

#days = math.floor((years-math.floor(years))*365)
#January 1st 1970
#eopch time starts December 31st 1969 so we should be close
months = 0
years = 1970

#find current month and year
#dealing with leap year...
while (days > monthOfYear[months-1]):
    days = days - monthOfYear[months-1]

    #With leap year calculation, we are off by 31 days...
    #Without: 20 Days
    if months == 1:
        if (years % 4 == 0 and not years % 100 == 0) or years % 400 == 0:
            print('{} is leap year'.format(years))
            days = days - 1

    months = months+1
    if months is 12:
        months = 0
        years = years + 1

print('years: {}'.format(years))
print('month: {}'.format(months))
print('days: {}'.format(days))

#print('hours: {}'.format(hours))
#print('minutes: {}'.format(minutes))
#print('seconds: {}'.format(seconds))
#print('milliseconds: {}'.format(ms))