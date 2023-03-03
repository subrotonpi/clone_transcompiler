def main ( ) :
    import sys
    import os
    import subprocess
    import subprocess
    import time
    import sys
    n = int ( os.environ [ 'NUMBER_OF_NUMBER' ] )
    m = int ( 1E9 ) + 7
    sum = 1
    for i in range ( 1 , n + 1 ) :
        sum *= i
        sum %= m
    print ( sum )
