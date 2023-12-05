def import sys
class Main ( object ) :
    def __init__ ( self , a , b , s ) :
        self.a = a
        self.b = b
        self.s = s
        flag = True
        for i in range ( a + b ) :
            if i == a :
                flag &= s [ i ] == '-'
            else :
                flag &= s [ i ].isdigit ( )
        print ( 'Yes' if flag else 'No' )
