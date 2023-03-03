def import _puts
class Main ( object ) :
    def __init__ ( self , data ) :
        for i in data :
            for j in i :
                print ( j , end = '' )
            print ( '\n' , end = '' )
        return
    def __init__ ( self , * args ) :
        sc = _puts ( args )
        h , w = sc.__next__ ( )
        a = [ ]
        for i in range ( h ) :
            a.append ( ( sc.__next__ ( ) , '#' ) )
        b = [ ]
        r = [ ]
        for i in range ( h ) :
            for j in range ( w ) :
                if j == 0 :
                    b.append ( '#' )
                    r.append ( '.' )
                elif j == w - 1 :
                    b.append ( '.' )
                    r.append ( '#' )
                else :
                    if i % 2 == 0 :
                        b.append ( '.' )
                        r.append ( '#' )
                    else :
                        b.append ( '#' )
                        r.append ( '#' )
        for i in range ( h ) :
            for j in range ( w ) :
                if a [ i ] == '#' :
                    r.append ( '#' )
                    b.append ( '#' )
        self.puts ( b )
        self.puts ( r )
        return
