def main ( ) :
    import sys
    from random import randint
    solve ( )
    def solve ( ) :
        sc = sys.stdin
        s = sc.read ( )
        x = sc.randint ( 0 , 10000 )
        y = sc.randint ( 0 , 10000 )
        xdp = [ ]
        ydp = [ ]
        xnow = 1
        ynow = 1
        xdp.append ( 1 )
        ydp.append ( 1 )
        flag = True
        judge = True
        count = 0
        for j in s :
            if j == 'F' :
                count += 1
            else :
                list = [ ]
                if count != 0 :
                    if judge :
                        for i in range ( 20000 ) :
                            if xdp [ i ] == xnow :
                                list.append ( i )
                        for i in range ( 10000 ) :
                            z = list [ i ]
                            xdp.append ( z + count )
                    else :
                        for i in range ( 20000 ) :
                            if xdp [ i ] == xnow :
                                list.append ( i )
                        for i in range ( 10000 ) :
                            z = list [ i ]
                            ydp.append ( z + count )
                    xnow += 1
                else :
                    for i in range ( 20000 ) :
                        if ydp [ i ] == ynow :
                            list.append ( i )
                    for i in range ( 10000 ) :
                        z = list [ i ]
                        ydp.append ( z + count )
                        ydp.append ( z - count )
                    ynow += 1
            flag = not flag
            judge = False
            count = 0
    return solve ( )
