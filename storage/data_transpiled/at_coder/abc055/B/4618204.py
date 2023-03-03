def main ( ) :
    import sys
    import os
    import subprocess
    import subprocess
    import sys
    import time
    n = int ( time.time ( ) )
    m = 1000000007
    sum = 1
    for i in range ( 1 , n + 1 ) :
        sum *= i
        sum %= m
    print ( sum )
