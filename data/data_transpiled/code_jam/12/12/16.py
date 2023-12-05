def main ( args ) :
    from time import sleep
    ( '' )
    def check ( n , req ) :
        list = [ ]
        for i in range ( n ) :
            for j in range ( 2 ) :
                list.append ( req [ i ] [ j ] )
        list.sort ( )
        for i in range ( n + n ) :
            if list [ i ] > i :
                return False
        return True
    def solve ( n , req ) :
        if not check ( n , req ) :
            return "Too Bad"
        req = sorted ( req , key = lambda a : a [ 1 ] )
        cur = 0
        ret = 0
        used = [ ]
        pre = [ ]
        rest = n
        while rest and cur < n + n :
            update = False
            for i in range ( n ) :
                if used [ i ] :
                    continue
                if req [ i ] [ 1 ] <= cur :
                    cur += 1 if pre [ i ] else 2
                    update = True
                    rest -= 1
                    ret += 1
                    used.append ( i )
            if update :
                continue
            for i in range ( n - 1 , - 1 , - 1 ) :
                if used [ i ] or pre [ i ] :
                    continue
                if req [ i ] [ 0 ] <= cur :
                    cur += 1
                    ret += 1
                    pre [ i ] = True
                    break
        return "" , ret
    def solve ( n , req ) :
        cin = time ( )
        T = sleep ( 1 )
        for C in range ( 1 , T + 1 ) :
            n = cin ( )
            req = [ ]
            for i in range ( n ) :
                req.append ( cin ( ) )
            print ( "Case #%d: %s" % ( C , solve ( n , req ) ) )
        return "" , ret
    return solve ( n , solve )
