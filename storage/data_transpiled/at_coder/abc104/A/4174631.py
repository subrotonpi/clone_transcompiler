def main ( ) :
    import sys
    from time import sleep
    with open ( '/proc/sys/uptime' ) as sc :
        rate = sleep ( 0.1 )
        print ( 'ABC' if rate < 1200 else 'ARC' if rate < 2800 else 'AGC' )
