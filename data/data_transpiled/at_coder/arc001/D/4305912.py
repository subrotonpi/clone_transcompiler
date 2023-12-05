def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.place = [ ]
        self.putCount = [ ]
    def check ( self ) :
        sc = _main.Scanner ( )
        for i in range ( 8 ) :
            tmp = sc.next ( )
            for j in range ( 8 ) :
                if tmp [ j ] == 'Q' :
                    self.plus ( i , j , True )
                    self.putCount [ i , j ] = True
        self.check ( 5 )
        self.ok = True
        for i in range ( 8 ) :
            for j in range ( 8 ) :
                if self.putCount [ i , j ] and self.place [ i , j ] > 0 :
                    self.ok = False
        if self.ok :
            for i in range ( 8 ) :
                for j in range ( 8 ) :
                    print ( self.putCount [ i , j ] , 'Q' if self.putCount [ i , j ] else '.' , end = '' )
                print ( )
        else :
            print ( 'No Answer' )
    def check ( self ) :
        for i in range ( 8 ) :
            for j in range ( 8 ) :
                if self.place [ i , j ] == 0 and not self.putCount [ i , j ] :
                    self.plus ( i , j , True )
                    self.putCount [ i , j ] = True
                    if self.putNum == 1 :
                        return True
                    if self.check ( self.putNum - 1 ) :
                        return True
                    else :
                        self.plus ( i , j , False )
                        self.putCount [ i , j ] = False
        return False
return Main
