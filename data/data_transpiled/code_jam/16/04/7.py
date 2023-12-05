def main ( ) :
    import sys
    from itertools import count
    for case_num in range ( 1 , num_cases + 1 ) :
        K , C , S = count ( case_num )
        print ( "Case #{}:".format ( case_num ) , end = ' ' )
        if C * S < K :
            print ( " IMPOSSIBLE" )
            continue
        for i in range ( 0 , K , C ) :
            index = 0
            for j in range ( i , i + C ) :
                index = index * K + min ( j , K - 1 )
            print ( " {}".format ( index + 1 ) , end = ' ' )
        print ( )
