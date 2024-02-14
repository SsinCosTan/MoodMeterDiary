//
//  MainViewController.swift
//  MoodMeterDiary
//
//  Created by mint on 1/17/24.
//

import UIKit

class MainViewController: UIViewController {
    let calendarView: UICalendarView = {
        let calendar = UICalendarView()
        calendar.calendar = .current
        calendar.locale = .current
        calendar.fontDesign = .monospaced
        calendar.translatesAutoresizingMaskIntoConstraints = false
        
        return calendar
    }()

    override func viewDidLoad() {
        super.viewDidLoad()
        view.backgroundColor = .systemBackground
        navigationItem.title = "MOODMETER"
        configureCalendarView()
        // Do any additional setup after loading the view.
    }
    
    func configureCalendarView() {
        view.addSubview(calendarView)
        
        NSLayoutConstraint.activate([
            calendarView.leadingAnchor.constraint(equalTo: view.safeAreaLayoutGuide.leadingAnchor),
            calendarView.trailingAnchor.constraint(equalTo: view.safeAreaLayoutGuide.trailingAnchor),
            calendarView.topAnchor.constraint(equalTo: view.safeAreaLayoutGuide.topAnchor),
            calendarView.bottomAnchor.constraint(equalTo: view.safeAreaLayoutGuide.bottomAnchor)
        ])
    }

}

