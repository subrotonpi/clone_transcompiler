def main ( ) :
    import datetime
    from datetime import datetime
    from datetime import datetime
    from datetime import datetime
    sc = open ( 'input.txt' , 'r' )
    d = { }
    temp = sc.readline ( )
    N = int ( temp )
    temp = sc.readline ( )
    temp_lst = temp.split ( )
    int_lst = [ int ( i ) for i in temp_lst ]
    previous_gcd = 0
    for i in range ( N ) :
        previous_gcd = gcd ( previous_gcd , int_lst [ i ] )
    print ( previous_gcd )
    def gcd ( a , b ) :
        if b > 0 :
            return gcd ( b , a % b )
        else :
            return a
    return gcd
