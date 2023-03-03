def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.stdin.read ( )
    flag , imposible = False , False
    a = [ ]
    b = [ ]
    for i in range ( n ) :
        b.append ( sys.stdin.read ( ) )
    for i in range ( n ) :
        for j in range ( len ( b ) - 1 , 0 , - 1 ) :
            if b [ j ] == j + 1 :
                a.append ( j + 1 )
                b.pop ( j )
                flag = True
                break
        if flag == False :
            imposible = True
            break
        else :
            flag = False
    if imposible == True :
        print ( - 1 )
    else :
        for i in range ( len ( a ) - 1 , 0 , - 1 ) :
            print ( a [ i ] )
