def main ( ) :
    import datetime
    from datetime import datetime
    from datetime import date
    with open ( './' ) as sc :
        DATE = sc.readline ( )
        split_date = DATE.split ( '/' )
        today = False
        y , m , d = [ int ( i ) for i in split_date [ : 3 ] ]
        x = y // m
        if y % m != 0 or x % d != 0 :
            cl = datetime ( year = y , month = m - 1 , day = d )
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
            print ( DATE )
