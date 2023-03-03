def main ( ) :
    import os
    class Main ( object ) :
        def __init__ ( self ) :
            self.bfr = open ( "/proc/self/data/" )
            data = bfr.read ( )
    wa = re.findall ( r'\d+' , data )
    N = int ( wa [ 0 ] )
    a = int ( wa [ 1 ] )
    b = int ( wa [ 2 ] )
    sum = 0
    for i in range ( 1 , N + 1 ) :
        tmp_sum = 0
        num = i
        while num != 0 :
            tmp_sum += num % 10
            num /= 10
        if tmp_sum >= a and tmp_sum <= b :
            sum += i
    print ( sum )
