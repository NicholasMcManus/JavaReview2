import math
import time

monthOfYear = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
monthsWritten = ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']
ms = int(round(time.time()*1000))
#ms = 561555550000  
#Determine Years
seconds = math.floor(ms / 1000)
minutes = math.floor(seconds / 60)
hours = math.floor(minutes /60)
days = math.floor(hours/24)
months = math.floor(days/30)
years = math.floor(days /365)

#print('{} true days'.format(days))
print('Days from months: {}'.format((months-math.floor(months))*30))
#print('{} true months'.format(months))
print('Months from years: {}'.format((years-math.floor(years))*12))
print('{} years\n'.format(years))



days = math.ceil(hours/24)
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

    #With leap year calculation, we are off by 1 day
    #Fixed by rounding days up insetead of floor
    #Without: 20 Days
    if months == 1:
        if (years % 4 == 0 and not years % 100 == 0) or years % 400 == 0:
            print('{} is a leap year'.format(years))
            days = days - 1

    months = months+1
    if months is 12:
        months = 0
        years = years + 1

print('\nyears: {}'.format(years))
print('month: {}'.format(monthsWritten[months]))
print('days: {}\n'.format(days))


#print('\nmilliseconds: {}'.format(ms))
#print('seconds: {}'.format(seconds))
#print('minutes: {}'.format(minutes))
#print('hours: {}'.format(hours))
#print('days: {}\n'.format(math.floor(hours/24)))


#print('testing something\n----')
#days = hours/24
#years = days/365
#months = (years-math.floor(years))*12

#Calculating days from seconds
#days = math.floor(ms/86400000)
#days = days%365

#i = 0
#while days > monthOfYear[i]:
#    print('month {} has passed'.format(i+1))
#    days = days - monthOfYear[i]
#    print('{} days remain'.format(days))
#    i = i + 1

#days = (months-math.floor(months))*monthOfYear[math.floor(months)-1]

#print('year: {}'.format(math.floor(years)+1970))
#print('month: {}'.format(math.floor(months)))
#print('day: {}'.format(math.floor(days)))