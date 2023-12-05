def import is_prime
class Main ( object ) :
    PRIME = ( 2 , 3 , 5 , 7 , 11 , 13 , 17 , 19 , 23 , 29 , 31 , 37 , 41 , 43 , 47 , 53 , 59 , 61 , 67 , 71 , 73 , 79 , 83 , 89 , 97 , 101 , 103 , 107 , 109 , 113 , 127 , 131 , 137 , 139 , 149 , 151 , 157 , 163 , 167 , 173 , 179 , 181 , 191 , 193 , 197 , 199 , 211 , 223 , 227 , 229 , 233 , 239 , 241 , 251 , 257 , 263 , 269 , 271 , 277 , 281 , 283 , 293 , 307 , 311 , 313 , 317 )
    def __init__ ( self , * args ) :
        sc = object.__code__
        sums = [ ]
        count = 0
        for i in range ( 3 , 100000 , 2 ) :
            if is_prime ( i ) and is_prime ( ( i + 1 ) // 2 ) :
                count += 1
            sums.append ( count )
        s = [ ]
        q = sc.randint ( 1 , 100000 )
        for i in range ( q ) :
            l = sc.randint ( 1 , 100000 )
            r = sc.randint ( 1 , 100000 )
            s.append ( sums [ r // 2 + 1 ] - sums [ l // 2 ] )
        print ( s , end = '' )
    def is_prime ( x ) :
        for i in range ( len ( PRIME ) ) :
            if x <= PRIME [ i ] :
                break
            if x % PRIME [ i ] == 0 :
                return False
        return True
