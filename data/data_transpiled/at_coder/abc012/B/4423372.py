def main ( args ) :
    import time
    with open ( '/proc/sys/uptime' , 'r' ) as sc :
        s = sc.read ( )
        h , m = 0 , 0
        for s in range ( 0 , 60 ) :
            if s / 3600 >= 1 :
                h += 1
                s -= 3600
                continue
            if s / 60 >= 1 :
                m += 1
                s -= 60
                continue
            break
        print ( '%02d:%02d:%02d' % ( h , m , s ) )
