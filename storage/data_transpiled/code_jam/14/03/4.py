def _import ( ) :
    from ..utils import fileinput
    from ..utils import fileoutput
    from ..utils import scanner
    class Minesweeper ( object ) :
        def __init__ ( self ) :
            sc = scanner.Scanner ( "jam.in" )
            f = open ( "jam.out" , "w" )
            if self.flag :
                f.write ( "Impossible\n" )
            else :
                for i in range ( 0 , self.cases ) :
                    f.write ( ans [ i ] )
                    f.write ( "\n" )
    map = { }
    if is_swapt :
        for i in range ( 0 , R ) :
            for j in range ( 0 , C ) :
                ans [ i ] = map [ i ] [ j ]
    else :
        for i in range ( 0 , R ) :
            for j in range ( 0 , C ) :
                ans [ i ] = map [ i ] [ j ]
    map [ 0 ] = 'c'
    if is_swapt :
        for i in range ( 0 , C ) :
            ans [ i ] = '*'
        if R == 1 :
            for i in range ( 0 , M ) :
                ans [ 0 ] = '.'
        else :
            if M % 2 == 1 and R == 2 or ( M % 2 == 1 and M < 9 ) or M < 4 :
                flag = False
                if M == 1 :
                    flag = True
            else :
                m = M
                if M % 2 == 1 :
                    m -= 3
                low = m // 2
                if low > C :
                    low = C
                m -= 2
                for i in range ( 2 ) :
                    for j in range ( low ) :
                        map [ i ] [ j ] = map [ x ] [ y + 1 ] = map [ x ] [ y + 2 ] = '.'
    x += 1
    y = 0
if C % 2 == 1 :
    map [ x ] = map [ x ] [ y + 1 ] = map [ x ] [ y + 2 ] = '.'
return map
