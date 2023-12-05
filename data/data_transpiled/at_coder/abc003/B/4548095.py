def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        self.sarr = sc.read ( )
        self.tarr = sc.read ( )
        chars = set ( [ '@' , 'a' , 't' , 'c' , 'o' , 'd' , 'e' , 'r' ] )
        print ( 'You can win' if self.sarr.issubset ( chars ) else 'You will lose' )
    def issubset ( self , sarr , tarr ) :
        for i in range ( len ( sarr ) ) :
            for j in range ( len ( tarr ) ) :
                if self.isValid ( chars , sarr [ i ] , tarr [ j ] ) :
                    continue
                else :
                    return False
        return True
    def isValid ( self , c1 , c2 ) :
        return ( c1 == '@' and c2 in self.sarr ) or ( c2 == '@' and c1 in self.tarr ) or ( c1 == c2 )
