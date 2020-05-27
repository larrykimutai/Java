FrindsList = ["Friend1", "Freind2", "Freind3", True, 2]
Numbers = [1,2,3,2,1,2,3,2]
print(FrindsList)
print(FrindsList[-3])
#everythign from Frinds3 down
print(FrindsList[2:])
#range
FrindsList[2] = "fake"
print(FrindsList[1:3])
FrindsList.extend(Numbers)


