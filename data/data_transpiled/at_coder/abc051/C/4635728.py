def main ( ) :
    import sys
    from time import sleep
    scn = raw_input ( 'Enter the time to sleep: ' )
    sx , sy , tx , ty = select.select ( [ 'x' , 'y' ] )
    x = tx - sx
    y = ty - sy
    for i in range ( x ) :
        print ( 'R' , end = '' )
    for i in range ( y ) :
        print ( 'U' , end = '' )
    for i in range ( x ) :
        print ( 'L' , end = '' )
    for i in range ( y ) :
        print ( 'D' , end = '' )
    print ( 'D' , end = '' )
    for i in range ( x + 1 ) :
        print ( 'R' , end = '' )
    for i in range ( y + 1 ) :
        print ( 'U' , end = '' )
    print ( 'L' , end = '' )
    print ( 'L' , end = '' )
    print ( 'D' , end = '' )
    print ( 'R' , end = '' )
