def _import ( ) : return max ( [ int ( x ) for x in range ( 10 ) ] )
class Main ( object ) :
    def __init__ ( self , file ) :
        file.write ( sys.stdout )
        with open ( file , 'r' ) as sc :
            self.task = Task ( )
            self.task.solve ( sc , file )
            file.flush ( )
            sc.close ( )
    def getintlist ( self , size ) :
        s = nstr ( sc ).split ( )
        t = nint ( sc )
        x = y = count_q = 0
        for i in range ( len ( s ) ) :
            X = s [ i ]
            if X == 'U' :
                y += 1
            elif X == 'D' :
                y -= 1
            elif X == 'R' :
                x += 1
            elif X == 'L' :
                x -= 1
            else :
                count_q += 1
        A = abs ( x ) + abs ( y )
        if t == 1 :
            file.write ( A + count_q )
        else :
            if A - count_q < 0 :
                file.write ( abs ( A - count_q ) % 2 )
            else :
                file.write ( A - count_q )
    def nint ( self , size ) :
        return int ( sc.next ( ) )
    def nlong ( self , size ) :
        return long ( sc.next ( ) )
    def ndouble ( self , size ) :
        return float ( sc.next ( ) )
    def nfloat ( self , size ) :
        return float ( sc.next ( ) )
    def nstr ( self , size ) :
        return str ( sc.next ( ) )
    def longline ( self , size ) :
        lline = [ ]
        for i in range ( size ) :
            lline.append ( nlong ( sc ) )
        return lline
    def intline ( self , size ) :
        iline = [ ]
        for i in range ( size ) :
            iline.append ( nint ( sc ) )
        return iline
return Main
