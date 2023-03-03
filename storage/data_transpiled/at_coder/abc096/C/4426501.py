def import isBlack
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.h , self.w = self.sc.split ( ' ' )
        self.sc.close ( )
        self.cv = [ ]
        for i in range ( self.h ) :
            data = self.sc.read ( )
            for j in range ( self.w ) :
                self.cv.append ( data [ j ] )
    flg = True
    up , down , left , right = False , False , False , False
    for i in range ( self.h ) :
        for j in range ( self.w ) :
            if isBlack ( i , j ) :
                up , down , left , right = isBlack ( i - 1 , j )
                if not ( up or down or left or right ) :
                    flg = False
    if flg :
        print ( 'Yes' )
    else :
        print ( 'No' )
    def isBlack ( self , y , x ) :
        try :
            if self.cv [ y ] [ x ] == '#' :
                return True
            else :
                return False
        except IndexError :
            return False
