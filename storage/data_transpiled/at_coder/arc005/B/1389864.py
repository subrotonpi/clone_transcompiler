def import sys , glob
class Main ( object ) :
    def __init__ ( self ) :
        self.x = sys.maxsize - 1
        self.y = sys.maxsize - 1
        W = sys.argv [ 1 ]
        vec = [ ]
        if W == "R" :
            vec.append ( 1 )
            vec.append ( 0 )
        if W == "L" :
            vec.append ( - 1 )
            vec.append ( 0 )
        if W == "U" :
            vec.append ( 0 )
            vec.append ( - 1 )
        if W == "D" :
            vec.append ( 0 )
            vec.append ( 1 )
        if W == "RU" :
            vec.append ( 1 )
            vec.append ( - 1 )
        if W == "RD" :
            vec.append ( 1 )
            vec.append ( 1 )
        if W == "LU" :
            vec.append ( - 1 )
            vec.append ( - 1 )
        if W == "LD" :
            vec.append ( - 1 )
            vec.append ( 1 )
        c = [ ]
        for s in glob ( "./" ) :
            for i in range ( 9 ) :
                d = str ( s [ i ] )
                c.append ( d )
        ans = ""
        ans += c [ x ] [ y ]
        for i in range ( 1 , 4 ) :
            if x + vec [ 0 ] < 0 :
                vec [ 0 ] = 1
            elif x + vec [ 0 ] >= 9 :
                vec [ 0 ] = - 1
            if y + vec [ 1 ] < 0 :
                vec [ 1 ] = 1
            elif y + vec [ 1 ] >= 9 :
                vec [ 1 ] = - 1
            x += vec [ 0 ]
            y += vec [ 1 ]
            ans += c [ x ] [ y ]
        print ( ans )
