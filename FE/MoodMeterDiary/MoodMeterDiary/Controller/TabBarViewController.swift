//
//  TabBarViewController.swift
//  MoodMeterDiary
//
//  Created by minsong kim on 1/23/24.
//

import UIKit

class TabBarViewController: UITabBarController {
    override func viewDidLoad() {
        super.viewDidLoad()
        
        setUpViewControllers()
    }
    
    func setUpViewControllers() {
        let main = UINavigationController(rootViewController: MainViewController())
        let profile = UINavigationController(rootViewController: ProfileViewController())
        let diary = UINavigationController(rootViewController: DiaryViewController())
        
        main.tabBarItem.title = "달력"
        profile.tabBarItem.title = "프로필"
        diary.tabBarItem.title = "글쓰기"
        
        main.tabBarItem.image = UIImage(systemName: "calendar")
        profile.tabBarItem.image = UIImage(systemName: "person.circle.fill")
        diary.tabBarItem.image = UIImage(systemName: "square.and.pencil")
        
        viewControllers = [main, diary, profile]
    }
}

