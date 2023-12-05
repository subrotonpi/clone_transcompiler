def import _replace_count
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin.read ( )
        nk = self.s.split ( )
        n , k = int ( nk [ 0 ] ) , int ( nk [ 1 ] )
        s = self.s [ n : ]
        orig = s.replace ( '' , '' )
        chars = s.replace ( '' , '' )
        if k == len ( chars ) :
            chars.sort ( )
            print ( u''.join ( chars ) )
            return
        for i in range ( len ( chars ) ) :
            min_i = i
            for j in range ( i + 1 , len ( chars ) ) :
                if chars [ min_i ] > chars [ j ] :
                    tmp = chars [ i ]
                    chars [ i ] = chars [ j ]
                    chars [ j ] = tmp
                    count = replace_count ( orig , chars )
                    if count <= k :
                        min_i = j
                    tmp = chars [ i ]
                    chars [ i ] = chars [ j ]
                    chars [ j ] = tmp
            if i != min_i :
                tmp = chars [ i ]
                chars [ i ] = chars [ min_i ]
                chars [ min_i ] = tmp
        print ( u''.join ( chars ) )
    def replace_count ( orig , chars ) :
        count = 0
        for i in range ( len ( orig ) ) :
            if orig [ i ] != chars [ i ] :
                count += 1
        return count
