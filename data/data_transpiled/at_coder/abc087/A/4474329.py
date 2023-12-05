def main ( ) :
    import sys
    import os
    sys.stdout.write ( ( os.getpid ( ) - os.getpid ( ) ) % os.getpid ( ) )
