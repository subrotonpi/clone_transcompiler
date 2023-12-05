def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.totalButton = sys.argv.pop ( 0 )
        self.buttonList = [ ]
        for buttonNum in range ( self.totalButton + 1 ) :
            temp = sys.argv.pop ( 0 )
            self.buttonList.append ( temp )
        nowButton = 1
        flag = False
        num = 0
        for num in range ( self.totalButton ) :
            temp = self.buttonList [ nowButton ]
            nowButton = temp
            if nowButton == 2 :
                flag = True
                num += 1
                break
        if flag == True :
            print ( num )
        else :
            print ( "-1" )
