def import import sys
import os
import sys
import random
import time
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sys.stdout = sys.__stdout__
        sys.stderr = sys.__stderr__
        sys.stdout = sys.__stdout__
        video_cnt = sys.argv [ 1 ]
        times_browsing_videos = sys.argv [ 2 ]
        delivery_person_rate_list = [ ]
        for idx in range ( video_cnt ) :
            delivery_person_rate_list.append ( os.getppid ( idx ) )
        delivery_person_rate_list.sort ( )
        delivery_person_rate_list.reverse ( )
        data = [ delivery_person_rate_list [ idx ] for idx in range ( times_browsing_videos ) ]
        data.sort ( )
        total_rate = 0
        if times_browsing_videos == 1 :
            for rate in data :
                total_rate = rate if rate > total_rate else total_rate
            total_rate = total_rate / 2
        else :
            for rate in data :
                total_rate = ( total_rate + rate ) / 2
        print ( total_rate )
