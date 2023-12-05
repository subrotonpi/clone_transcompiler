def main ( ) :
    import sys
    s = raw_input ( )
    nb_case = s.count ( 'Case' )
    for num_case in range ( 1 , nb_case + 1 ) :
        s.next ( )
        nb_candy = s.count ( 'Candy' )
        s.next ( )
        min = sys.maxint
        sum = 0
        xor = 0
        for i in range ( nb_candy ) :
            n = s.next ( )
            min = min ( min , n )
            sum += n
            xor ^= n
        print ( 'Case #' , end = ' ' )
        print ( num_case , end = ': ' )
        if xor == 0 :
            print ( sum - min )
        else :
            print ( 'NO' )
