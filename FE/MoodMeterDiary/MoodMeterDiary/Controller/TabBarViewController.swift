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
        let mainViewController = UINavigationController(rootViewController: MainViewController())
        let profileViewController = UINavigationController(rootViewController: ProfileViewController())
        
        mainViewController.tabBarItem.title = "달력"
        profileViewController.tabBarItem.title = "프로필"
        
        mainViewController.tabBarItem.image = UIImage(systemName: "calendar")
        profileViewController.tabBarItem.image = UIImage(systemName: "person.circle.fill")
        
        viewControllers = [mainViewController, profileViewController]
    }
}

