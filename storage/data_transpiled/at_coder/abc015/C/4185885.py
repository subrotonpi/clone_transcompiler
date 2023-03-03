def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.read_input ( )
        has_bug = self.xor ( 0 , 0 , 0 )
        if has_bug :
            print ( "Found" )
        else :
            print ( "Nothing" )
    def read_input ( ) :
        with open ( "input.txt" , "r" ) as sc :
            N = sc.read ( )
            K = sc.read ( )
            T = [ ]
            for i in range ( 1 , N + 1 ) :
                for j in range ( 1 , K + 1 ) :
                    T [ i ] [ j ] = sc.read ( )
    def xor ( self , i , j , sum ) :
        if i > N :
            if sum == 0 :
                return True
            else :
                return False
        sum ^= T [ i ] [ j ]
        has_bug = False
        for k in range ( 1 , K + 1 ) :
            has_bug = has_bug or xor ( self , i + 1 , k , sum )
        return has_bug
return Main
