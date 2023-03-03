def _calc ( s , ifplus , i ) :
    from pycket.interpreter import interpreter
    if i == len ( s ) - 1 :
        ans = 0
        before = - 1
        for j in range ( len ( s ) - 1 ) :
            if s [ before + 1 ] :
                ans += int ( s [ before + 1 : j + 1 ] )
                before = j
        ans += int ( s [ before + 1 : ] )
        return ans
    next1 = [ ]
    next2 = [ ]
    for j in range ( i ) :
        next1.append ( ifplus [ j ] )
        next2.append ( ifplus [ j ] )
    next1.append ( True )
    next2.append ( False )
    return _calc ( s , next1 , i + 1 ) + _calc ( s , next2 , i + 1 )
