def codejamquestion ( ) :
    import os
    import sys
    import os
    import os
    import sys
    import os
    import os
    import sys
    import os
    import codecs
    import codecs
    try :
        f = open ( "C-large.in" , "r" )
    except Exception :
        print ( "ERROR" )
    else :
        f = open ( "C-large.out" , "w" )
    tests = len ( f.readlines ( ) )
    for test in range ( 1 , tests + 1 ) :
        answer = "Case #%d: " % test
        outfits = ""
        days = 0
        J , P , S , k = [ int ( i ) for i in range ( 1 , J + 1 ) ]
        for j in range ( 1 , J + 1 ) :
            for p in range ( 1 , P + 1 ) :
                for i in range ( S and i < k ) :
                    outfits += "%d %d %d\n" % ( j , p , ( ( i + p + j ) % S ) + 1 )
                    days += 1
        answer += "%d\n%s" % ( days , outfits )
        f.write ( answer )
    f.close ( )
    os.remove ( "C-large.in" )
