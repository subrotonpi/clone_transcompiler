def _import ( ) :
    from itertools import repeat
    class Pogo ( object ) :
        def __init__ ( self , t , ans ) :
            print ( "Case #%d: %s" % ( t + 1 , ans ) )
            return
        def __init__ ( self , t , ans ) :
            Scanner ( ).__init__ ( self , t , ans )
    T = repeat ( [ '' ] )
    for t , x , y in enumerate ( repeat ( [ '' ] ) ) :
        if x == 0 and y == 0 :
            self.out ( t , '' )
            continue
        if x >= 0 :
            xplus , xminus , yplus , yminus = 'E' , 'W' , 'W' , 'W'
        else :
            x = - x
            xplus , xminus = 'W' , 'W' , 'E'
        if y >= 0 :
            yplus , yminus = 'N' , 'S' , 'N'
        else :
            y = - y
            yplus , yminus = 'S' , 'N'
        sum = x + y
        wa = 0
        i = 1
        for i in range ( sum + 10 ) :
            wa += i
            diff = wa - sum
            if diff >= 0 and diff % 2 == 0 :
                break
        ans2 = None
        dummy = 0
        while dummy < 1 :
            rev = ( wa - sum ) / 2
            x += rev
            ans = [ ]
            for k in repeat ( i , rev ) :
                if k <= rev :
                    ans.append ( xminus )
                    rev -= k
            for k in repeat ( i , rev ) :
                if ans [ k - 1 ] == 0 and k <= x :
                    ans.append ( xplus )
                    x -= k
            if x != 0 :
                break
            for k in repeat ( i , rev ) :
                if ans [ k ] == 0 :
                    ans.append ( yplus )
            ans2 = ans
        if ans2 is None :
            rev = ( wa - sum ) / 2
            y += rev
            ans = [ ]
            for k in repeat ( i , rev ) :
                ans.append ( ys