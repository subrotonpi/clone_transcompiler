def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin.read ( )
        self.n = len ( self.s )
    table = [ ]
    table2 = [ ]
    for i in range ( len ( table ) ) :
        table.append ( [ - 1 ] * ( n // 26 + 1 ) )
    res = 0
    index = n - 1
    count = 0
    for index in range ( len ( table ) ) :
        c = ord ( table [ index ] ) - ord ( 'a' )
        table2 [ res ].append ( c )
        if table [ res ] [ c ] != - 1 :
            continue
        table [ res ] [ c ] = index
        count += 1
        if count == 26 :
            res += 1
            count = 0
    str = [ ]
    for i in range ( res + 1 , - 1 , - 1 ) :
        pre = 0
        for j in range ( 26 ) :
            if table [ i ] [ j ] != - 1 :
                continue
            pre = j
            break
        str.append ( pre )
        if i > 0 :
            min = table2 [ i - 1 ] [ pre ]
            for j in range ( 26 ) :
                if table [ i - 1 ] [ j ] <= min :
                    table [ i - 1 ] [ j ] = - 1
    for i in range ( res + 1 ) :
        sys.stdout.write ( chr ( ord ( 'a' ) + str [ i ] ) )
    sys.stdout.write ( "\n" )
