def main ( ) :
    import datetime
    from datetime import datetime
    from time import sleep
    with open ( '/proc/date' , 'r' ) as sc :
        date = sc.read ( )
        split_date = date.split ( '/' )
        today = False
        y , m , d = int ( split_date [ 0 ] ) , int ( split_date [ 1 ] ) , int ( split_date [ 2 ] )
        x = y // m
        if y % m != 0 or x % d != 0 :
            cl = datetime ( y , m - 1 , d )
            outer :
                while True :
                    cl += datetime.timedelta ( days = 1 )
                    y = cl.year
                    m = cl.month + 1
                    d = cl.day
                    if y % m == 0 and y // m % d == 0 :
                        print ( '%04d/%02d/%02d' % ( y , m , d ) )
                        break outer
        else :
            print ( date )
