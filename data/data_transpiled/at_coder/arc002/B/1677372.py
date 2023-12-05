def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        md = ( - 1 , 31 , 28 , 31 , 30 , 31 , 30 , 31 , 31 , 30 , 31 , 30 , 31 )
        S = sc.read ( )
        sp = S.split ( '/' )
        Y = int ( sp [ 0 ] )
        M = int ( sp [ 1 ] )
        D = int ( sp [ 2 ] )
        ansy = 0
        ansm = 0
        ansd = 0
        y = Y
        m = M
        while ansy == 0 :
            day = md [ m ]
            if m == 2 :
                flag = False
                if y % 4 == 0 :
                    flag = True
                if y % 100 == 0 :
                    flag = False
                if y % 400 == 0 :
                    flag = True
                if flag :
                    day += 1
            for d in range ( D , day + 1 ) :
                if y % m == 0 :
                    y1 = y // m
                    if y1 % d == 0 :
                        ansy = y
                        ansm = m
                        ansd = d
                        break
        D = 1
        m += 1
        if m == 13 :
            m = 1
        if m == 1 :
            y += 1
    sy = str ( ansy )
    sm = str ( ansm )
    sd = str ( ansd )
    if ansm < 10 :
        sm = '0' + sm
    if ansd < 10 :
        sd = '0' + sd
    print ( sy , sm , sd )
