def main ( ) :
    import os
    from subprocess import Popen , PIPE
    from time import sleep
    try :
        taskcnt = int ( Popen ( [ "taskcnt" ] ).wait ( ) )
        total = 0
        for idx in range ( 1 , taskcnt + 1 ) :
            total += idx
        print ( ( total * 10000 ) / taskcnt )
    except :
        print ( "No task count found" )
