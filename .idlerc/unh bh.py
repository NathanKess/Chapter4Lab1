import random
import time
currentTime = time.clock()

winList = [141000000, 1952071, 70984, 416, 171, 7, 8, 5, 3]

numberRuns = 10		#how many simulations
cost = 2			#cost per ticket

winningPower = random.randrange(1,27)

numberList = range(1,70)#Possible Numbers
winningNumber = []		#Sets empty list (overwrite below)

for i in range(1,6):
    randomIndex = random.randrange(0,len(numberList)-1)
    winningNumber.append(numberList[randomIndex])
    numberList.pop(randomIndex) #removes number selected to avoid repeats


print "Winning numbers are, ", winningNumber
print "Winning powerball is ",winningPower

# Numbers for player to choose from
playerPower = random.randrange(1,27)

numberList = range(1,70)
playerNumber = []

for i in range(1,6):  #creates a random ticket (5 numbers)
    randomIndex = random.randrange(0,len(numberList)-1)
    playerNumber.append(numberList[randomIndex])
    numberList.pop(randomIndex) #removes selected ball to avoid repeats


print "Your numbers are: ", playerNumber
print "Your powerball is: ", playerPower

match = 0

for value in playerNumber:
    for number in winningNumber:
        if value == number:
            match +=1
print "You've matched: ", match, " numbers"

#######################################################################################################################################

money = 0
cost  = 0
while i < 180000:
    money -= 2
    cost += 2
    if playerPower == winningPower and match == 5:
        money += winList[0]
        print "you have", money
        i += 1
    elif match == 5:
        money += winList[1]
        print "you win", money
        i += 1
    elif match == 4 and winningPower == playerPower:
        money += winList[2]
        print "you have", money
        i += 1
    elif match == 4:
        money += winList[3]
        print "you have", money
        i += 1
    elif match == 3 and playerPower == winningPower:
        money += winList[4]
        print "you have", money
        i += 1
    elif match == 3:
        money += winList[5]
        print "you have", money
        i += 1
    elif match == 2 and playerPower == winningPower:
        money += winList[6]
        print "you have", money
        i += 1
    elif match == 1 and playerPower == winningPower:
        money += winList[7]
        print "you have", money
        i += 1
    elif playerPower == winningPower:
        money += winList[8]
        print "you have", money
        i += 1
    else:
        print "you gained $", money
        i += 1
        
print "you spent", cost
print "you have", money
