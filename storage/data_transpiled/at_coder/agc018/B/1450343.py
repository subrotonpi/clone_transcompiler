def _calc_max_num ( matrix , hold ) :
    from numpy import array
    from numpy.linalg import norm
    f = open ( '/proc/cpuinfo' , 'r' )
    tmplist = f.readline ( ).split ( )
    n , m = [ int ( i ) for i in tmplist ]
    matrix = [ [ int ( j ) for j in tmplist ] for i in range ( n ) ]
    hold = array ( [ True ] * ( m + 1 ) )
    hold [ 0 ] = False
    print ( calc_max_num ( matrix , hold ) )
    def calc_max_num ( matrix , hold ) :
        n , m = matrix.shape
        count = 0
        for i in hold :
            if i == True :
                count += 1
        if count == 0 :
            return float ( 'inf' )
        member = [ 0 ] * ( m + 1 )
        member.append ( 0 )
        for i in range ( n ) :
            for j in range ( m ) :
                if hold [ matrix [ i ] [ j ] ] :
                    member [ matrix [ i ] [ j ] ] += 1
                    break
        max = 0
        max_sport = 1
        for i in range ( 1 , m + 1 ) :
            if max < member [ i ] :
                max = member [ i ]
                max_sport = i
        hold [ max_sport ] = False
        max2 = calc_max_num ( matrix , hold )
        return min ( max , max2 )
    return calc_max_num
