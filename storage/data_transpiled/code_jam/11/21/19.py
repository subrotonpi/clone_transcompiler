def RPI ( ) :
    import random
    global RPI
    global inputs
    global caseNum
    inputs -= 1
    for i in range ( inputs ) :
        schools = random.randint ( 1 , 2 )
        scores = [ [ ] for i in range ( schools ) ]
        lst = [ ]
        for i in range ( schools ) :
            w = l = 0
            lst.append ( i )
            s = lst [ i ]
            for j in s :
                if j == '0' :
                    l += 1
                if j == '1' :
                    w += 1
            scores [ i ] [ 0 ] = w
            scores [ i ] [ 1 ] = l + w
        OWP = [ ]
        for i in range ( schools ) :
            s = lst [ i ]
            count = 0
            for j in s :
                if j == '0' :
                    count += 1
                    OWP [ i ] += 1.0 * ( scores [ j ] [ 0 ] - 1 ) / ( scores [ j ] [ 1 ] - 1 )
                if j == '1' :
                    count += 1
                    OWP [ i ] += 1.0 * scores [ j ] [ 0 ] / ( scores [ j ] [ 1 ] - 1 )
            OWP [ i ] /= count
        OOWP = [ ]
        for i in range ( schools ) :
            s = lst [ i ]
            count = 0
            for j in s :
                if j != '.' :
                    OOWP [ i ] += OWP [ j ]
                    count += 1
            OOWP [ i ] /= count
        RPI = [ ]
        for i in range ( schools ) :
            s = lst [ i ]
            RPI [ i ] +=.25 * scores [ i ] [ 0 ] / scores [ i ] [ 1 ] +.5 * OWP [ i ] +.25 * OOWP [ i ]
        print ( "Case #%d:" % caseNum )
        for i in range ( schools ) :
            print ( "%.7f" % i )
        caseNum += 1
